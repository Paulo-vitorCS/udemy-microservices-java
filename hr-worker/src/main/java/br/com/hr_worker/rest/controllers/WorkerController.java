package br.com.hr_worker.rest.controllers;

import br.com.hr_worker.domain.entities.Worker;
import br.com.hr_worker.rest.services.WorkerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private final WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workerList = workerService.findAll();
        return ResponseEntity.ok(workerList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker worker = workerService.findById(id);
        return ResponseEntity.ok(worker);
    }

}
