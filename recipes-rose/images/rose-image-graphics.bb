require recipes-rose/images/rose-image-minimal.bb

DESCRIPTION = "Image which adds graphic supports to minimal image."

IMAGE_INSTALL += " \
    packagegroup-qt5-all \
    gstreamer1.0-meta-base \
    gstreamer1.0-meta-video \
    gstreamer1.0-libav \
    gstreamer1.0-plugins-bad-fbdevsink \
    gstreamer1.0-plugins-bad-mpegpsdemux \
    "

