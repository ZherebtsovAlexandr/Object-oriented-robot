package com.mansonheart.domain;

/**
 * Created by alexandr on 18.09.16.
 */
public class UseCase {

    private final IRepository repository;

    public UseCase(IRepository repository) {
        this.repository = repository;
    }

    public Object execute() {
        return this.repository.get();
    }

}
