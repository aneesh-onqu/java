package com.forms.to.angular.oracle_form.guay_acf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayResTurno;

public interface GuayResTurnoRepository extends JpaRepository<GuayResTurno, String> {
    @Query(value = "SELECT * FROM GUAY_RES_TURNO t WHERE t.cdayuda = :cdayuda AND t.cdcurso = :cdcurso AND t.cdturno = :cdturno ", nativeQuery = true)
    List<GuayResTurno> findCdtpresByFilters( String cdayuda, String cdcurso, String cdturno);
}
