package comspringbanco.banco.RespositorySinCP;

    import org.springframework.data.repository.CrudRepository;
    import org.springframework.stereotype.Repository;

    @Repository
    public interface CuentasRepository extends CrudRepository<Cuenta, Integer> {}