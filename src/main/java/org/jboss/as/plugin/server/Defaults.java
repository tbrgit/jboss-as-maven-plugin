/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.plugin.server;

/**
 * @author <a href="mailto:jperkins@redhat.com">James R. Perkins</a>
 */
interface Defaults {

    /**
     * The default JVM arguments.
     */
    String DEFAULT_JVM_ARGS = "-Xms64m -Xmx512m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000";

    /**
     * The default group id
     */
    String JBOSS_AS_GROUP_ID = "org.jboss.as";

    /**
     * The default artifact id
     */
    String JBOSS_AS_ARTIFACT_ID = "jboss-as-dist";

    /*
     * The default packaging type
     */
    String JBOSS_AS_PACKAGING = "zip";

    /**
     * The default JBoss AS version.
     */
    String JBOSS_AS_TARGET_VERSION = "7.1.1.Final";

    /**
     * The default startup timeout.
     */
    String TIMEOUT = "60";
}
