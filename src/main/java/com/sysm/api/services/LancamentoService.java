package com.sysm.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.sysm.api.entities.Lancamento;

public interface LancamentoService {

	/**
	 * Retorna uma lista paginada de lançamentos de um determinado funcionário.
	 * @param funcionarioId
	 * @param pageRequest
	 * @return Page<Lancamento>
	 */
	Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);
	
	/**
	 * Retorna um lançamento por ID.
	 * @param id
	 * @return Optional<Lancamento>
	 */
	Optional<Lancamento> buscaPorId(Long id);
	
	/**
	 * Persiste u lançamento no banco de dados.
	 * @param lancamento
	 * @return Lancamento
	 */
	Lancamento persistir(Lancamento lancamento);
	
	/**
	 * Remove um lançamento da base de dados.
	 * @param id
	 */
	void remover(Long id);
}
