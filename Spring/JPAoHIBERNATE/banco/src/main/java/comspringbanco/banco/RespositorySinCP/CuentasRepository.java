package comspringbanco.banco.RespositorySinCP;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Podemos pasar datos para paginar PagingAndSortingRepository<Cuenta, Integer>
//JpaRepository<T,ID> devuelve una lista en findAll, flush() para transaciones usando @Transactional
    @Repository
    public interface CuentasRepository extends JpaRepository<Cuenta, Integer> {}