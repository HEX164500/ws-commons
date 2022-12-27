package ws.api.commons.security.authorization.roles.productcatalog;

import ws.api.commons.security.authorization.Role;

public enum BrandRoles implements Role {

	CREATE_BRAND_ITEM,
	READ_SINGLE_BRAND,
	READ_ALL_BRANDS,
	UPDATE_SINGLE_BRAND,
	UPDATE_ALL_BRANDS,
	DELETE_SINGLE_BRAND;

	@Override
	public String getAuthority() {
		return this.name();
	}

}
