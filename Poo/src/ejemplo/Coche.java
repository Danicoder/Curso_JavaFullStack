package ejemplo;
import java.util.Objects;
//1. Crear los atributos de la clase
//2. Crear los constructores (vacio, todos los par�metros) 
//2.b. (opcional) Crear m�s constructores y el de copia
//3. Crear Getters and Setters
//4. Crear toString
//5. Crear hashCode and Equals
//6. (Opcional) m�todos adicionale de la clase

public class Coche {
    
        private String matricula;
        private String marca;
        private String modelo;
        private int anyo;
        private int kms;
        static int contadorRodados;
     
        // Constructor vacío
        public Coche() {
            
        }

        
        // Constructor con todos los par�metros
        public Coche(String matricula, String marca, String modelo, int anyo, int kms) {
            super();
            this.matricula = matricula;
            this.marca = marca;
            this.modelo = modelo;
            this.anyo = anyo;
            this.kms = kms;
            if(kms>10000)
                contadorRodados++;
        }


        public Coche(String matricula, String marca, String modelo) {
            super();
            this.matricula = matricula;
            this.marca = marca;
            this.modelo = modelo;
        }

        // Constructor copia
        public Coche(Coche c) {
            super();
            this.matricula = c.matricula;
            this.marca = c.marca;
            this.modelo = c.modelo;
            this.anyo = c.anyo;
            this.kms = c.kms;
            if(kms>10000)
                contadorRodados++;
        }


        // Generar Getters and Setters
        
        public String getMatricula() {
            return matricula;
        }


        public void setMatricula(String matricula) {
           this.matricula = matricula;

        }


        public String getMarca() {
            return marca;
        }


        public void setMarca(String marca) {
            this.marca = marca;
        }


        public String getModelo() {
            return modelo;
        }


        public void setModelo(String modelo) {
            this.modelo = modelo;
        }


        public int getAnyo() {
            return anyo;
        }


        public void setAnyo(int anyo) {
            this.anyo = anyo;
        }


        public int getKms() {
            return kms;
        }


        public void setKms(int kms) {
            if(this.kms<=10000 && Math.abs(kms)>10000) // antes no estaba rodado y ahora sí
                contadorRodados++;
            else if(this.kms>10000 && Math.abs(kms)<=10000)
                contadorRodados--;
            this.kms = Math.abs(kms);
        }


        @Override
        public String toString() {
            String resultado = "Matricula: " + matricula + "\n"
                    + "Marca: " + marca + "\n"
                    + "Modelo: " + modelo + "\n"
                    +  "A�o: " + anyo;
            return resultado;
        }


        @Override
        public int hashCode() {
            return Objects.hash(marca, matricula, modelo);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Coche other = (Coche) obj;
            return Objects.equals(marca, other.marca) && Objects.equals(matricula, other.matricula)
                    && Objects.equals(modelo, other.modelo);
        }
     // Métodos adicionales
        
        /**
         * Método que dado un coche te dice si es nuevo o viejo, basándose en el año 2000
         * @return Cadena "Nuevo" si es mayor o igual al 2000, "Viejo" en caso contrario
         */
        public String estado() {
            if(this.anyo>=2000) {
                return "Nuevo";
            } else {
                return "Viejo";
            }
        }
        
        /**
         * Método que me devuelve true si el coche ya ha hecho el rodado, false en caso contrario.
         * Considero el coche rodado si tiene más de 10000 Kms
         * @return True si está rodado, false si no lo está
         */
        public boolean rodado() {
            if(this.kms>10000) {
                return true;
            } else {
                return false;
            }
        }
}
