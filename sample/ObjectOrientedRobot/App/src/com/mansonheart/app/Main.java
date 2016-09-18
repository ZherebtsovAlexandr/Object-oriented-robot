package com.mansonheart.app;

import com.mansonheart.data.Repository;

/**
 * Created by alexandr on 18.09.16.
 */
public class Main {

    public static void main(String[] args) {
        Repository repository = new Repository();
        Object object = repository.get();
    }

}
