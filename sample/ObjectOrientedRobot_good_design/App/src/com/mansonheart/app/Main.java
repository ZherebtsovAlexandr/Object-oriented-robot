package com.mansonheart.app;

import com.mansonheart.data.RepositoryImpl;
import com.mansonheart.domain.UseCase;

/**
 * Created by alexandr on 18.09.16.
 */
public class Main {

    public static void main(String[] args) {
        UseCase useCase = new UseCase(new RepositoryImpl());
        Object object = useCase.execute();
    }

}
