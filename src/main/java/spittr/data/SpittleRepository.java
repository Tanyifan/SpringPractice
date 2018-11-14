package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spittle;

import java.util.List;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/13
 */
@Component
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittleId);
}
