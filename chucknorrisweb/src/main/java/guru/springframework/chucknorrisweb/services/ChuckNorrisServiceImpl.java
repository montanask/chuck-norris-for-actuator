package guru.springframework.chucknorrisweb.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Ihor Sukalin on 01.01.2023
 *
 * @author : Ihor Sukalin
 * date : 01.01.2023
 * project : chuck-norris-for-actuator
 */

@Service
public class ChuckNorrisServiceImpl implements ChuckNorrisService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
