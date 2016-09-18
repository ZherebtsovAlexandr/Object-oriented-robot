package com.mansonheart.domain;

import com.mansonheart.data.Repository;

/**
 * Created by alexandr on 18.09.16.
 */
public class UseCase {

    private final Repository repository;

    public UseCase(Repository repository) {
        this.repository = repository;
    }

    public Object execute() {
        return this.repository.get();
    }

}
