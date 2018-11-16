package spittr.data;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spittr.Spitter;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/15
 */
@Component
public class SpitterImpl implements SpitterRepository {

    @Override
    public Spitter save(Spitter spitter) {
        return null;
    }

    @Override
    public Spitter findByUsername(String userName) {
        return null;
    }
}
