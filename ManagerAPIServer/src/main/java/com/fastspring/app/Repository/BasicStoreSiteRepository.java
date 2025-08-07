package com.fastspring.app.Repository;
import com.brightmarket.core.site.BasicStoreSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicStoreSiteRepository extends JpaRepository<BasicStoreSite, String>{
}
