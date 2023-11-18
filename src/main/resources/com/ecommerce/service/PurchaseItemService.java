package com.ecommerce.service;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.dao.PurchaseItemDAO;
import com.ecommerce.entity.PurchaseItem;

@Component
public class PurchaseItemService {

@Autowired
private PurchaseItemDAO purchaseItemDAO;

@Transactional
public PurchaseItem getItemById(long id){
return purchaseItemDAO.getItemById(id);

}

@Transactional
publicList<PurchaseItem> getAllItemsByPurchaseId(long purchaseId){
return purchaseItemDAO.getAllItemsByPurchaseId(purchaseId);
}

@Transactional
publicvoid updateItem(PurchaseItem item){
purchaseItemDAO.updateItem(item);
}


@Transactional
publicvoid deleteItem(long id){
purchaseItemDAO.deleteAllItemsForPurchaseId(id);
}

@Transactional
publicvoid deleteAllItemsForPurchaseId(long purchaseId){
purchaseItemDAO.deleteAllItemsForPurchaseId(purchaseId);
}



}
