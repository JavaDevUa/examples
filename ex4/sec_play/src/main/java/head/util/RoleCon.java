package head.util;

import head.domain.HeadRole;

public enum RoleCon {

    OBSERVER("ROLE_OBSERVER"),
    ADMIN("ROLE_ADMIN"),
    SUPER_ADMIN("ROLE_SUPER_ADMIN"),
    ERICSSON("ROLE_ERICSSON");

    public String label;
    public HeadRole headRole;

    RoleCon(String label) {
        this.label = label;
        this.headRole = new HeadRole(label);
    }


}
