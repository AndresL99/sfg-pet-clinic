package guro.springframework.sfgpetclinic.service.map;

import guro.springframework.sfgpetclinic.domain.Speciality;
import guro.springframework.sfgpetclinic.service.CrudService;
import guro.springframework.sfgpetclinic.service.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality e) {
        return super.save(e);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
