package researchportal.Springresearchportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import researchportal.Springresearchportal.entity.User;

public interface UsersRepo extends JpaRepository<User, Integer >{
	
}
