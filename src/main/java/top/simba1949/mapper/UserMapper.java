package top.simba1949.mapper;

import top.simba1949.domain.User;

import java.util.List;

/**
 * @author anthony
 * @date 2022/4/10
 */
public interface UserMapper {
    /**
     * 查询所有
     * @return
     */
    List<User> selectAll();
}
