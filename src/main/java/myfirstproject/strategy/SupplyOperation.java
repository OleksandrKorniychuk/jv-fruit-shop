package myfirstproject.strategy;

import myfirstproject.model.Fruit;

public class SupplyOperation implements OperationHandler {
    @Override
    public void changeValue(Fruit fruit, int value) {
        dataBaseDao.saveDataToCustomDB(fruit, dataBaseDao.getRecordFromDB(fruit) + value);
    }
}
