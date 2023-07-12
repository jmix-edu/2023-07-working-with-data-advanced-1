package com.company.application.screen.extstoragebrowse;

import com.company.application.app.StorageService;
import com.company.application.entity.ExtStorage;
import com.company.inventorycontrolsystem.entity.Storage;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import com.company.inventorycontrolsystem.screen.storage.StorageBrowse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UiController("ics_Storage.browse")
@UiDescriptor("ext-storage-browse.xml")
public class ExtStorageBrowse extends StorageBrowse {
    private static final Logger log = LoggerFactory.getLogger(ExtStorageBrowse.class);

    @Autowired
    private StorageService storageService;

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        List<Storage> storages = storageService.fetchStorage();

        List<ExtStorage> extStorages = storageService.fetchExtStorage();

        log.info("");
    }


}