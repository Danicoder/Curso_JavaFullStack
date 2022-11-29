package com.example.ejemplospringeventos.seguridad;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JWTAuthorizationFilter extends OncePerRequestFilter{
        private final String HEADER = "Authorization";
        private final String PREFIX = "Bearer ";
        
        //clase heredada,para comprobar el token
        @Override
        protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
            try {
                //obtiene el token llamando al método getJWTToken
                String token = getJWTToken(request);
                if (token != null) {
                    //Creamos un objeto que representa el algoritmo de cifrado del token con su contraseña
                    Algorithm algorithm = Algorithm.HMAC256("token101");
                    //verificación de token
                    JWTVerifier verifier = JWT.require(algorithm)
                        .withIssuer("arturober") //opcional: quién emite el token
                        .build(); //Reusable verifier instance - genera el verificador
                    DecodedJWT jwt = verifier.verify(token); //comprueba que el token sea correcto
                    setUpSpringAuthentication(jwt); //mete los datos de autenticación en la aplicación
                }
                //continua para que spring el que decida sí hace falta token para validar
                chain.doFilter(request, response);
            } catch (JWTVerificationException e) {
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                ((HttpServletResponse) response).sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
            }
        }	
    
        /**
         * Metodo para autenticarnos dentro del flujo de Spring
         * 
         * @param claims
         */
        private void setUpSpringAuthentication(DecodedJWT jwt) {
            Authentication auth = new UsernamePasswordAuthenticationToken(jwt.getSubject(), jwt.getClaim("id"), null);
            SecurityContextHolder.getContext().setAuthentication(auth);
        }
    
        private String getJWTToken(HttpServletRequest request) {
            //obtenenemos el valor de la cabecera
            String authenticationHeader = request.getHeader(HEADER);
            if (authenticationHeader == null || !authenticationHeader.startsWith(PREFIX)) ///sí no envía el token
                return null;
            return authenticationHeader.replace(PREFIX, "");//sí si hay token devuelve el token sin prefijo
        }
}
