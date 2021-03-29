package basesyntax.implementation;


import basesyntax.StoreOperationsExecutable;
import basesyntax.model.FruitDto;
import basesyntax.servise.StorageService;

public class BuyOperation implements StoreOperationsExecutable {
    private StorageService storageService;

    public BuyOperation(StorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public void executeOperation(FruitDto fruitDto) {
        storageService.removeItemData(fruitDto);
    }
}
