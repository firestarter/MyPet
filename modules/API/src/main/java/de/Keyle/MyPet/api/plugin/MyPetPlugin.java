/*
 * This file is part of mypet-api
 *
 * Copyright (C) 2011-2016 Keyle
 * mypet-api is licensed under the GNU Lesser General Public License.
 *
 * mypet-api is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mypet-api is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package de.Keyle.MyPet.api.plugin;

import de.Keyle.MyPet.api.BukkitHelper;
import de.Keyle.MyPet.api.entity.EntityRegistry;
import de.Keyle.MyPet.api.entity.MyPetInfo;
import de.Keyle.MyPet.api.repository.MyPetList;
import de.Keyle.MyPet.api.repository.PlayerList;
import de.Keyle.MyPet.api.repository.Repository;
import de.Keyle.MyPet.api.util.CompatUtil;
import de.Keyle.MyPet.api.util.hooks.HookManager;
import org.bukkit.plugin.Plugin;

import java.io.File;

public interface MyPetPlugin extends Plugin {
    Repository getRepository();

    BukkitHelper getBukkitHelper();

    File getFile();

    MyPetInfo getMyPetInfo();

    EntityRegistry getEntityRegistry();

    CompatUtil getCompatUtil();

    PlayerList getPlayerList();

    MyPetList getMyPetList();

    HookManager getHookManager();

    boolean isInOnlineMode();
}