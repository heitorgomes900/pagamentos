package br.com.alurafood.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alurafood.pagamentos.models.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    
}
