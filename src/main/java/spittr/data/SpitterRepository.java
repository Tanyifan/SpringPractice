package spittr.data;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import spittr.Spitter;
import spittr.Spittle;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/14
 */
@Component
public interface SpitterRepository {
    Spitter save(Spitter spitter);
    Spitter findByUsername(String userName);
}
