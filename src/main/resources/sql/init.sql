CREATE TABLE `genius_task` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL,
  `task_param` text NOT NULL,
  `status` int(11) NOT NULL DEFAULT '-1',
  `gmt_created` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8