package com.auto.autodemo.controller;

import com.auto.autodemo.error.AutoNotFoundException;
import com.auto.autodemo.model.Automobile;
import com.auto.autodemo.repository.AutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping(value="/machinery")
public class AutomobileController {
    //почему не @Autowired
    private final AutoRepository autoRepository;

    //нужен ли конструктор ????
    public AutomobileController(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    // Получить все записи
    @GetMapping(value = "/automobiles")
    public List<Automobile> getAllAuto() {
        return autoRepository.findAll();
    }

    @GetMapping("/automobiles/{id}")
    private Automobile getAuto(@PathVariable("id") long id) {
        return autoRepository.findById(id)
                .orElseThrow(() -> new AutoNotFoundException(id));
    }

    @DeleteMapping("/automobiles/{id}")
    private void deleteAuto(@PathVariable("id") long id) {
        autoRepository.deleteById(id);
    }

    @PostMapping("/automobiles")
    private long saveAuto(@RequestBody Automobile Auto) {
        autoRepository.save(Auto);
        return Auto.getId();
    }
}