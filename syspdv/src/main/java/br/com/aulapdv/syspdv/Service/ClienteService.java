import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.aulapdv.syspdv.domain.Cliente;
import br.com.aulapdv.syspdv.repository.ClienteRepository;
import ch.qos.logback.core.net.server.Client;

public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return this.clienteRepository.findAll();
    }
    public Cliente findById(Integer id){
        return this.clienteRepository.findById(id).get();
    }
    public Cliente save(Cliente cliente){
        return this.clienteRepository.save(cliente);
    }
    public void deleteById(Integer id){
        this.clienteRepository.deleteById(id);
    }
}
