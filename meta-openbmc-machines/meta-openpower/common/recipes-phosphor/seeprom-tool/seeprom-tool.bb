SUMMARY = "Read seeprom on OpenPOWER machines"
DESCRIPTION = "Tool to read OpenPower seeprom devices"
PR = "r1"

DEPENDS = "glibc"

require ${PN}.inc

S = "${WORKDIR}/git"

# Fix GNU_HASH problem
TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/seeprom ${D}${bindir}/
}
