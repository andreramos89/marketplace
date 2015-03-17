/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2015 Pentaho Corporation. All rights reserved.
 */

package org.pentaho.marketplace.domain.model.entities.interfaces;

import org.pentaho.marketplace.domain.model.entities.MarketEntryType;

import java.util.Collection;

public interface IPlugin {

  //region Properties

  //id
  String getId();
  void setId( String value );

  //name
  String getName();
  void setName( String value );

  //img
  String getImg();
  void setImg( String value );

  //smallImg
  String getSmallImg();
  void setSmallImg( String value );

  //documentationUrl
  String getDocumentationUrl();
  void setDocumentationUrl( String value );

  //description
  String getDescription();
  void setDescription( String value );

  //author
  String getAuthorName();
  void setAuthorName( String value );

  //AuthorUrl
  String getAuthorUrl();
  void setAuthorUrl( String value );

  //AuthorLogo
  String getAuthorLogo();
  void setAuthorLogo( String value );

  //installedBranch
  String getInstalledBranch();
  void setInstalledBranch( String value );

  //installedVersion
  String getInstalledVersion();
  void setInstalledVersion( String value );

  //installedBuildId
  String getInstalledBuildId();
  void setInstalledBuildId( String value );

  //installationNotes
  String getInstallationNotes();
  void setInstallationNotes( String value );

  //installed
  boolean isInstalled();
  void setInstalled( boolean value );

  //versions
  Collection<IPluginVersion> getVersions();
  void setVersions( Collection<IPluginVersion> value );

  //screenshots
  String[] getScreenshots();
  void setScreenshots( String[] value );

  //dependencies
  String getDependencies();
  void setDependencies( String value );

  //license
  String getLicense();
  void setLicense( String value );

  //license_name
  String getLicenseName();
  void setLicenseName( String value );

  //licence_text
  String getLicenseText();
  void setLicenseText( String value );

  // Category
  ICategory getCategory();
  void setCategory( ICategory category );

  // Type
  MarketEntryType getType();
  void setType( MarketEntryType type );

  int getRank();
  void setRank( int rank );
  //endregion

  //region Methods
  IPluginVersion getVersionByBranch( String branch );
  //endregion
}
