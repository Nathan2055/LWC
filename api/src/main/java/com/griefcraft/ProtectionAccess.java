package com.griefcraft;

/**
 * Access levels for protections. ordinal values are used here meaning they must remain in a constant order. As well,
 * the enum values are ranked in power of ascending order meaning ProtectionAccess(4) has more power than
 * ProtectionAccess(1) will. This also implies that the initial implementation is complete and that adding
 * any more access levels would be a pain.
 * <p/>
 * As well, the only exception to these rules is EXPLICIT_DENY which will immediately deny access to the
 * protection. This will not always be used but may be useful in some cases.
 */
public enum ProtectionAccess {

    /**
     * Immediately reject access to the protection.
     */
    EXPLICIT_DENY,

    /**
     * User has NO access to the protection
     */
    NONE,

    /**
     * The user can view the protection but not modify it in any way. The implementation of this depends
     * on the mod and if the mod does not support preventing the inventory from being modified somehow
     * then access will just be blocked.
     */
    GUEST,

    /**
     * The user can only deposit into the protection
     */
    DEPOSITONLY,

    /**
     * User has MEMBER access to the protection meaning they can open it and access it, but not admin
     * it in any way (add others, etc)
     */
    MEMBER,

    /**
     * User can modify the protection (add and remove members) but not add or remove other managers.
     */
    MANAGER,

    /**
     * User has the same access as the user who created the protection. They can remove the protection,
     * add or remove ANY level to the protection (i.e other owners) but they cannot remove themself.
     */
    OWNER;

}
