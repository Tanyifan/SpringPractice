package spittr.data;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import spittr.Spittle;

import java.util.List;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/15
 */
@Component
public class SpittleImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }
    @Override
    public Spittle findOne(long spittleId) {
        return null;
    }
}
