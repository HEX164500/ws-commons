package ws.api.commons.security.authorization.roles.productcatalog;

import ws.api.commons.security.authorization.Role;

public enum ProductRoles implements Role {

	CREATE_PRODUCT_ITEM,
	READ_SINGLE_PRODUCT,
	READ_ALL_PRODUCTS,
	UPDATE_SINGLE_PRODUCT,
	UPDATE_ALL_PRODUCTS,
	DELETE_SINGLE_PRODUCT;

	@Override
	public String getAuthority() {
		return this.name();
	}

}
