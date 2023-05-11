
package com.mdiportfolio.mdi.Repository;

import com.mdiportfolio.mdi.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {

}
