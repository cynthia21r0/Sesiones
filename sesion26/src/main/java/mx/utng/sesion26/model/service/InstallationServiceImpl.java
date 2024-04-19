/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */

package mx.utng.sesion26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.sesion26.model.dao.IInstallationDao;
import mx.utng.sesion26.model.entity.Installation;

@Service
public class InstallationServiceImpl implements IInstallationService {
    @Autowired
    private IInstallationDao dao;

    @Transactional(readOnly = true)
    @Override
    public List<Installation> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Installation installation) {
        dao.save(installation);
    }

    @Transactional(readOnly =  true)
    @Override
    public Installation getById(Long id) {
       return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
       dao.delete(id);
    }

    
}
