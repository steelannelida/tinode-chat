# Docker file builds an image with a utility which initializes rethinkdb cluster.
# It needs to be run only once per cluster. Use it as (assuming your running RethinkDB
# container is named 'rethinkdb'):
# $ docker run --name=init-tinode-db --link rethinkdb --env SNOWFLAKE_UID_KEY=base64+encoded+24+bytes= init-rethinkdb

FROM golang

MAINTAINER Gene Sokolov <or.else@gmail.com>

RUN go get github.com/tinode/chat/tinode-db \
	&& go install github.com/tinode/chat/tinode-db

# Key to initialize UID generator. Replace with your own
# for production
ENV SNOWFLAKE_UID_KEY la6YsO+bNX/+XIkOqc5Svw==

COPY config.template /
COPY entrypoint.sh /
RUN chmod +x /entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]

