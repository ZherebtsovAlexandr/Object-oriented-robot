package com.mansonheart.app;

import com.mansonheart.data.Repository;
import com.mansonheart.domain.UseCase;

/**
 * Created by alexandr on 18.09.16.
 */
public class Main {

    public static void main(String[] args) {
        UseCase useCase = new UseCase(new Repository());
        Object object = useCase.execute();
    }

}
