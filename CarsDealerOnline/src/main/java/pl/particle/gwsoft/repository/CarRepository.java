package pl.particle.gwsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.particle.gwsoft.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
