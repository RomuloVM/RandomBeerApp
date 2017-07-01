package classes;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Iterables;

@RestController
public class BeersController {
	
	@Autowired
	private BeersRepository beersRepository;
	
	@RequestMapping("/randomBeer")
    public Beers randomBeer() {
        Iterable<Beers> beers = beersRepository.findAll();
        
        int size = Iterables.size(beers);
        
        Random r = new Random();
        int chosenOne = r.nextInt(size);
        
        Beers chosenBeer = Iterables.get(beers, chosenOne);
        
        return chosenBeer;
    }
    
}
