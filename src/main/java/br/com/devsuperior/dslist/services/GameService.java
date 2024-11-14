package br.com.devsuperior.dslist.services; // service é a classe de serviços, são as regras de negocio.

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsuperior.dslist.dto.GameDTO;
import br.com.devsuperior.dslist.dto.GameMinDTO;
import br.com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository; // Injetando instancia do GameRepository no GameService

	@Transactional(readOnly= true)	// garante o ACID (Atomicidade, Consistência, Isolamento, Durabilidade)
	public GameDTO findById(Long id) {
		var result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly= true)	// garante o ACID (Atomicidade, Consistência, Isolamento, Durabilidade)
	public List<GameMinDTO> findAll() {
		var result = gameRepository.findAll(); // var é o mesmo que List<Game>
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); // Operação para transformar uma
																						// lista de Game para GameMinDTO
		return dto;
	}

}
