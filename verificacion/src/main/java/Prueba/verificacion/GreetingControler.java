package Prueba.verificacion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "referencia_a_la_clase")
public class GreetingControler {
    private final AtomicLong Counter= new AtomicLong();
    private static final String template = "Hello %s";
    @GetMapping
    public newclass referencia_a_la_clase(@RequestParam(value = "name",defaultValue = "World") String name){
        return new newclass(Counter.incrementAndGet(),String.format(template,name));
    }
}
