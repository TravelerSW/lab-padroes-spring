package one.digitalinnovation.labpadroesspring.service.impl;

import org.springframework.stereotype.Service;

import one.digitalinnovation.labpadroesspring.model.Cliente;
import one.digitalinnovation.labpadroesspring.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    //TODO Singleton: Injetar os componentes  do Spring com @Autowired
    //TODO Strategy: inmplementar os métodos definidos na interface
    //TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente>buscarTodos(){
        //FIXME Buscar todos os clientes
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id){
        //FIXME Buscar cliente por id.
        return null;
    }

    @Override
    public void inserir(Cliente cliente){
        //FIXME Verificar se o endereço do cliente já existe(pelo cep).
        //FIXME Caso não exista, integrar com o ViaCep e  persistir o retorno.
        //FIXME Inserir cliente, vinculando o endereço(novo ou existente.).
        
    }

    @Override
    public void atualizar(Long id, Cliente cliente){
        //FIXME Buscar Cliente por id, caso exista.
        //FIXME Verificar se o endereço do cliente já existe(pelo cep).
        //FIXME Caso não exista, integrar com o ViaCep e  persistir o retorno.
        //FIXME Alterar cliente, vinculando o endereço(novo ou existente.).
    }

    @Override
    public void deletar(Long id){
        //FIXME Deletar cliente por ID
    }


    
}
