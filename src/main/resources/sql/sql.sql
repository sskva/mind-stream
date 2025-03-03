CREATE TABLE IF NOT EXISTS mind_stream
(
    id          BIGINT AUTO_INCREMENT,
    text        TEXT      NOT NULL,
    time_insert TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
) COLLATE utf8_bin;