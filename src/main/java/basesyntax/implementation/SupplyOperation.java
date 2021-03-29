package basesyntax.implementation;

import basesyntax.StoreOperationsExecutable;
import basesyntax.model.FruitDto;
import basesyntax.servise.StorageService;

public class SupplyOperation implements StoreOperationsExecutable {
    private StorageService storageService;

    public SupplyOperation(StorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public void executeOperation(FruitDto fruitDto) {
        storageService.addItemData(fruitDto);
    }
}
