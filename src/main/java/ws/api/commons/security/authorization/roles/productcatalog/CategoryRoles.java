package ws.api.commons.security.authorization.roles.productcatalog;

import ws.api.commons.security.authorization.Role;

public enum CategoryRoles implements Role {

	CREATE_CATEGORY_ITEM,
	READ_SINGLE_CATEGORY,
	READ_ALL_CATEGORIES,
	UPDATE_SINGLE_CATEGORY,
	UPDATE_ALL_CATEGORIES,
	DELETE_SINGLE_CATEGORY;

	@Override
	public String getAuthority() {
		return this.name();
	}

}
