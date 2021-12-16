package br.org.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;

/**
 * A Annotation @Repository: indica que a Interface é do tipo repositório,
 * ou seja, é responsável pela comunicação com o Banco de dados através dos métodos
 * padrão e das Method Queries (Métodos Personalizados), que são consultas personalizadas 
 * através de palavras chave que representam as instruções da linguagem SQL.
 */
@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	/**
	 * Method Query equivalente a instrução SQL: 
	 * 
	 * SELECT * FROM tb_postagem where titulo like "%titulo%";
	 */
	public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}