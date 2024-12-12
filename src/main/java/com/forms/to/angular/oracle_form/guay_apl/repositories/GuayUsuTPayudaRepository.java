package com.forms.to.angular.oracle_form.guay_apl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.forms.to.angular.oracle_form.guay_apl.entities.GuayUsuTPayuda;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GuayUsuTPayudaRepository extends JpaRepository<GuayUsuTPayuda, String> {

    @Query(value ="SELECT * FROM GUAY_USU_TPAYUDA u WHERE u.COD_USUARIO = :codUsuario AND u.CDAYUDA = :cdayuda" , nativeQuery = true)
    List<GuayUsuTPayuda> findGrupoPerfilByCodUsuarioAndCdayuda(String codUsuario, String cdayuda);


}