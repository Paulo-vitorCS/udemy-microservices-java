package br.com.hr_worker.rest.services;

import br.com.hr_worker.domain.entities.Worker;
import br.com.hr_worker.domain.repositories.WorkerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Transactional(readOnly = true)
    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Worker findById(Long id) {
        return workerRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Worker not found"));
    }

}
