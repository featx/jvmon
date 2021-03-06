package org.featx.spec.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.featx.spec.model.Unified;

/**
 * @author Excepts
 * @since 2019/10/30 17:34
 */

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public abstract class AbstractUnified<I> extends AbstractUpdate<I> implements Unified {

    private static final long serialVersionUID = -4454709709156471875L;

    private String code;

    private String name;

    private Integer type;
}
