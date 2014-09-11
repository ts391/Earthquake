package org.eclipse.rcptt.ecl.filesystem.internal;

import java.io.IOException;
import java.net.URI;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.rcptt.ecl.filesystem.EclFile;

public class ResourceFileResolver implements EclFileResolver {
	{
		// Creation should fail if resource plug-in is not available
		ResourcesPlugin.getWorkspace().getRoot();
	}

	@Override
	public EclFile resolve(URI uri) throws IOException {
		IPath path = toPath(uri);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		if (uri.getScheme().equals("workspace")) {
			return new ResourceFile(path);
		}
		return null;
	}

	private static IPath toPath(URI uri) {
		final String path = uri.getPath().substring(1); // removes leading slash
		if (path == null) {
			throw new NullPointerException("Bad URI: " + uri);
		}
		return Path.fromPortableString(path);
	}
}
