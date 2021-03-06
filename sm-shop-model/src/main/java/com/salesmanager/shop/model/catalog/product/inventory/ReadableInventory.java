package com.salesmanager.shop.model.catalog.product.inventory;

import java.util.ArrayList;
import java.util.List;
import com.salesmanager.shop.model.catalog.product.ReadableProductPrice;
import com.salesmanager.shop.model.catalog.product.product.instance.ReadableProductInstance;
import com.salesmanager.shop.model.store.ReadableMerchantStore;

public class ReadableInventory extends InventoryEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String creationDate;

	private ReadableMerchantStore store;
	private ReadableProductInstance instance;
	private List<ReadableProductPrice> prices = new ArrayList<ReadableProductPrice>();

	public ReadableMerchantStore getStore() {
		return store;
	}

	public void setStore(ReadableMerchantStore store) {
		this.store = store;
	}

	public List<ReadableProductPrice> getPrices() {
		return prices;
	}

	public void setPrices(List<ReadableProductPrice> prices) {
		this.prices = prices;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public ReadableProductInstance getInstance() {
		return instance;
	}

	public void setInstance(ReadableProductInstance instance) {
		this.instance = instance;
	}

}
