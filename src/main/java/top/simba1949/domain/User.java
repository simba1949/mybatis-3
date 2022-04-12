package top.simba1949.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author anthony
 * @date 2022/4/10
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 6226302148605524294L;

    private Long id;
    private String code;
    private String username;
    private String password;
    private String phone;
    private String email;
    private LocalDateTime birthday;
    private String address;
    private Byte isEnable;
    private Byte isDelete;
    private Long version;
    private LocalDateTime gmtCreate;
    private String creator;
    private Long creatorId;
    private LocalDateTime gmtModified;
    private String modifier;
    private Long modifierId;
}
